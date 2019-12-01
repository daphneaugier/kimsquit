import React from 'react';
import {Card} from 'react-bootstrap';
import axios from 'axios';
import globalVal from "./globalVal";

export default class announcements extends React.Component{
    state = {
        announcement: []
    }

    componentDidMount() {
        
        const announcementsData = () => axios.get(`http://localhost:8080/api/v1/announcement/${globalVal.courseId}`)
          .then(res => {
             
            this.setState({ announcement: res.data });
            console.log(this.state.announcement);
          })
        announcementsData();

        if(!typeof globalVal.courseId === 'undefined')
        {

        }
        else
        {
            setTimeout(announcementsData,250);
        }
    }

    render(){
        const {announcement} = this.state;

        return(
            <div className="announcements-component">
                <Card style={{height: '53vh'}}> 
                    <Card.Body>
                        <div align="left" >
                        <Card.Title style={{ color: '#2699FB', fontSize: 23}}>Recent Announcements</Card.Title>
                         <Card.Text>
                         <hr />
                        {announcement && announcement.map(announcement => (
                            <>
                             <p> <big>{announcement.announcement}</big> <br/>
                                 <small>{announcement.date}</small> 
                             </p>
                         
                              <hr />
                            </>
                        ))}
                        
                        
                        
                        
                         
                         
                         </Card.Text>
                         </div>  
                    </Card.Body>
                </Card>
                
          
                
           </div>
        );
    }
}



