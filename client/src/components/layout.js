import React from 'react';
import Navbar from './navbar';
import Sidebar from './sidebar';
import { Container, Row, Col} from 'react-bootstrap';
import './layout.css';

export default class layout extends React.Component{
    render(){
        return(
            <body>
                <div>
                    <Row> 
                        <Col> 
                             <Navbar/>
                        </Col>
                    </Row>
                    <Row> 
                        <Col> 
                             <Sidebar/>
                        </Col>
                    </Row>
                
             
               </div>
            </body>
            
        );
    }
}