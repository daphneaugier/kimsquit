import React from 'react';
import {Card} from 'react-bootstrap';
import axios from 'axios';

export default class contactinfo extends React.Component{
    state = {
        teacherInfo: []
    }

    componentDidMount() {
        axios.get(`http://localhost:8080/api/v1/teacher/1`)
          .then(res => {
             
            this.setState({ teacherInfo: res.data });
            
          })
    }

    render(){
        const {teacherInfo} = this.state;
        return(
            <div className="contactInfo-component">
                
                <Card style={{height: '28vh'}}> 
                    <Card.Body>
                        <div align="left"> 
                            <Card.Title style={{ color: '#2699FB', fontSize: 25}}>Contact information</Card.Title>
                            <hr />
                            <Card.Text>
                            <p style={{fontSize: 20}}>{'Mr. ' + teacherInfo.firstName + ' ' + teacherInfo.lastName}</p>
                          
                            <p>Email: kallman@emsb.qc.ca</p>

                            <p style={{fontSize: 15}}>{teacherInfo.address}</p>
                            
                            </Card.Text>
                        </div>
                                         
                        </Card.Body>
                </Card>
          
                
           </div>
        );
    }
}



