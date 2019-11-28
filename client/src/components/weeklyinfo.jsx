import React from 'react';
import {Card} from 'react-bootstrap';
import { MdNotificationsNone, MdMailOutline } from "react-icons/md";
import { FaRegUser } from "react-icons/fa";

export default class weeklyinfo extends React.Component{
    render(){
        
        return(
            <div className="weeklyinfo-component">
                
                <Card style={{ backgroundColor: '#7FC4FD', height: '80.1vh'}}> 
                    <Card.Body>
                       <Card.Title style={{ color: 'black', fontSize: 40}}>Name of course with section</Card.Title>
                            <Card.Text style={{ color: 'black', fontSize: 25}}>
                                Naruto Uzumaki :D 
                                <br/>          
                                POD: Tuesdays 17:45-20:30 
                                <br/> 
                                Office: EV2.422
                                <br/> 
                                
                             </Card.Text>
                                                
                    </Card.Body>
                </Card>
          
                
           </div>
        );
    }
}



