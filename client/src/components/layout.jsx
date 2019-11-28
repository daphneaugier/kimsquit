import React from 'react';
import Navbar from './navbar.jsx';
import Sidebar from './sidebar.jsx';
import ContactInfo from './contactinfo.jsx';
import Announcements from './announcements.jsx';
import WeeklyInfo from './weeklyinfo.jsx';
import {Card, Row, Col} from 'react-bootstrap';
import './layout.css';



export default class layout extends React.Component{
    
    
    render(){
       
        return(
            
            <body>
                
                    <div className="box"> 
                    
                        <br/>
                        <Row> 
                             <Col> 
                                 <Navbar/>
                             </Col>
                            
                        </Row>
                        <br/>
                        
                        <Row> 
                          
                          <Col xs={3}> 
                            <Sidebar/>   
                          </Col>

                         <Col xs={3}> 
                              <ContactInfo/>
                              <br/>
                              <Announcements/>
                         </Col>

                         <Col xs={6}>
                            <WeeklyInfo/>
                         </Col>
                         
                        
                        
                        </Row>

                        
                        
                    </div>
                    
             
              
            </body>
            
        );
    }
}