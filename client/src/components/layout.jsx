import React from 'react';
import Navbar from './navbar';
import Sidebar from './sidebar';
import { Container, Row, Col} from 'react-bootstrap';
import './layout.css';
import axios from 'axios';



export default class layout extends React.Component{
    state = {
        courses: [],
    }

    componentDidMount(){
        axios.get(`http://localhost:8080/api/v1/course`)
                .then(res => {
                    console.log(res);
                    this.setState({
                        courses: res
                    });
 
             })
    }

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