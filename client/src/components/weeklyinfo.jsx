import React from 'react';
import {Card} from 'react-bootstrap';
import { GoCommentDiscussion } from "react-icons/go";
import { FaRegListAlt, FaRegFileAlt} from "react-icons/fa";
import axios from 'axios';

export default class weeklyinfo extends React.Component{
    state = {
        course: []
    }

    componentDidMount() {
        axios.get(`http://localhost:8080/api/v1/course/ENGL10`)
          .then(res => {
             
            this.setState({ course: res.data });
           
          })
    }
    render(){
        const {course} = this.state;
        return(
            <div className="weeklyinfo-component">
                
                <Card style={{ backgroundColor: '#7FC4FD', height: '84vh'}}> 
                    <Card.Body>
                       <div align="left" >
                       <Card.Title align="left" style={{ color: 'black', fontSize: 29}}>{course.courseId + ': ' + course.courseDescription }</Card.Title>
                       <hr />
                            <Card.Text style={{ color: 'black', fontSize: 25 }}>
                            
                            <p ><FaRegListAlt /> &nbsp; Announcement </p>
                            
                            <p ><FaRegFileAlt /> &nbsp; Course outline </p>   
                            <p ><GoCommentDiscussion /> &nbsp; Discussion and questions </p>
                            <hr />
                              <p>1 September - 7 September </p> 
                            <hr />
                              <p>8 September - 14 September</p>
                            <hr />
                              <p>15 September - 21 September</p>
                              <hr />
                              <p>22 September - 28 September</p>
                              <hr />
                              <p>29 September - 5 October</p>
                              <hr />
                             </Card.Text>
                         
                        </div>           
                    </Card.Body>
                </Card>
          
                
           </div>
        );
    }
}



