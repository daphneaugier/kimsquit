import React from 'react';
import {Card} from 'react-bootstrap';


export default class announcements extends React.Component{
    render(){
        
        return(
            <div className="announcements-component">
                <Card style={{height: '42vh'}}> 
                    <Card.Body>
                        <Card.Title align="center" style={{ color: '#2699FB', fontSize: 23}}>Recent Announcements</Card.Title>
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



