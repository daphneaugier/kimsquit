import React from 'react';
import {Card} from 'react-bootstrap';
import axios from 'axios';

export default class announcements extends React.Component{
    state = {
        announcement: []
    }

    componentDidMount() {
        axios.get(`http://localhost:8080/api/v1/announcement/ENGL10`)
          .then(res => {
             
            this.setState({ announcement: res.data });
            console.log(this.state.announcement);
          })
    }

    render(){
        const {announcement} = this.state;

        return(
            <div className="announcements-component">
                <Card style={{height: '42vh'}}> 
                    <Card.Body>
                        <div align="left" >
                        <Card.Title style={{ color: '#2699FB', fontSize: 23}}>Recent Announcements</Card.Title>
                         <Card.Text>
                         <hr />
                        
                            <p> <big>{announcement.annoucementText}</big> <br/>
                                <small>{announcement.date}</small> 
                            </p>
                        
                        <hr />
                        <p> <big>Quiz material for next week</big> <br/>
                                <small>2019-11-20 12:30:31</small> 
                            </p>
                            <hr />

                        <p> <big>Tutorial starts next week</big> <br/>
                                <small>2019-11-13 10:05:43</small> 
                        </p>
                         
                         
                         </Card.Text>
                         </div>  
                    </Card.Body>
                </Card>
                
          
                
           </div>
        );
    }
}



