import React, {useState, useEffect } from "react";
import { makeStyles } from "@material-ui/core/styles";
import TreeView from "@material-ui/lab/TreeView";
import ExpandMoreIcon from "@material-ui/icons/ExpandMore";
import ChevronRightIcon from "@material-ui/icons/ChevronRight";
import TreeItem from "@material-ui/lab/TreeItem";
import {Card} from 'react-bootstrap';
import axios from 'axios';
import globalVal from "./globalVal";

const useStyles = makeStyles({
  root: {
    height: 216,
    flexGrow: 1,
    maxWidth: 400
  }
});


export default function SidebarMenu() {
  const classes = useStyles();

  const [data, setData] = useState({ courses: [], attendees: [], oneStudentData: []});



  useEffect(() => {
    const fetchData = async () => {
      const studentCourses = await axios(
        `http://localhost:8080/api/v1/student/${globalVal.studentId}/course`,
      );
      
      const Attendees = await axios(
        `http://localhost:8080/api/v1/course/${globalVal.courseId}/students`
      );

      const gradeForOneStudent = await axios (
        ` http://localhost:8080/api/v1/grade/${globalVal.studentId}`
      );

      setData({ courses: [...studentCourses.data], attendees: [...Attendees.data], oneStudentData: [...gradeForOneStudent.data]});
    };

    if(!typeof globalVal.courseId === 'undefined'){}
    else{
      setTimeout(fetchData,250);
    }
    
  }, []);


  return (
    
    <Card style={{height: '84vh'}}> 
     <Card.Body>
      <Card.Title align="center" style={{ color: '#2699FB', fontSize: 30}}>Navigation Menu</Card.Title>
      <hr />
        <TreeView
          className={classes.root}
          defaultCollapseIcon={<ExpandMoreIcon />}
          defaultExpandIcon={<ChevronRightIcon />}
        >
        
          <TreeItem nodeId="1" label="Attendees">
            {data && data.attendees.map(attendee => (
                <TreeItem nodeId={attendee.userId} label={attendee.firstName + ' ' + attendee.lastName} />
            ))}
          
          </TreeItem>

          <TreeItem nodeId="2" label="Grades">
          {data && data.oneStudentData.slice(0, 1).map(studentOne => (
            <TreeItem nodeId="2000" label={"Course total: " + studentOne.grade}>
            </TreeItem>
          ))}
          </TreeItem>

          <TreeItem nodeId="3000" label="My courses">
          {data && data.courses.map(courses => (
                <TreeItem nodeId={courses.courseId} label={courses.courseId} />
            ))}
          </TreeItem>
          
        </TreeView>
     </Card.Body>
    </Card>
  );
}
