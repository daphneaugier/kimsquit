import React, {useState, useEffect } from "react";
import { makeStyles } from "@material-ui/core/styles";
import TreeView from "@material-ui/lab/TreeView";
import ExpandMoreIcon from "@material-ui/icons/ExpandMore";
import ChevronRightIcon from "@material-ui/icons/ChevronRight";
import TreeItem from "@material-ui/lab/TreeItem";
import {Card} from 'react-bootstrap';
import axios from 'axios';

const useStyles = makeStyles({
  root: {
    height: 216,
    flexGrow: 1,
    maxWidth: 400
  }
});


export default function SidebarMenu() {
  const classes = useStyles();

  const [data, setData] = useState({ courses: [] });

  useEffect(() => {
    const fetchData = async () => {
      const result = await axios(
        `http://localhost:8080/api/v1/course`,
      );
      setData({ courses: [...result.data] });
    };
    fetchData();
    
  }, []);


  return (
    <Card style={{height: '80vh'}}> 
     <Card.Body>
      <Card.Title align="center" style={{ color: '#2699FB', fontSize: 30}}>Navigation Menu</Card.Title>
        <TreeView
          className={classes.root}
          defaultCollapseIcon={<ExpandMoreIcon />}
          defaultExpandIcon={<ChevronRightIcon />}
        >
        
                    
          <TreeItem nodeId="1" label="My courses">
          {data && data.courses.map(courses => (
                <TreeItem nodeId={courses.courseId} label={courses.courseId} />
            ))}
          </TreeItem>
          

          <TreeItem nodeId="2" label="Grades">
            <TreeItem label="bet">

            </TreeItem>
          </TreeItem>

          <TreeItem nodeId="3" label="Attendees">
            <TreeItem label="bet">

            </TreeItem>
          </TreeItem>

        </TreeView>
     </Card.Body>
    </Card>
  );
}
