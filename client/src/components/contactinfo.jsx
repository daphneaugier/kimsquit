import React from 'react';
import {Card} from 'react-bootstrap';


export default class contactinfo extends React.Component{
    render(){
        
        return(
            <div className="contactInfo-component">
                
                <Card style={{height: '35vh'}}> 
                    <Card.Body>
                        <Card.Title align="center" style={{ color: '#2699FB', fontSize: 25}}>Contact information</Card.Title>
                        <Card.Text>
                         Naruto Uzumaki :D 
                         <br/>
                         POD: Tuesdays 17:45-20:30 
                         <br/>
                         Office: EV2.422
                        </Card.Text>
                                         
                        </Card.Body>
                </Card>
          
                
           </div>
        );
    }
}


