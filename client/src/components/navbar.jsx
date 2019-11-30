import React from 'react';
import { Navbar, Nav} from 'react-bootstrap';
import { MdNotificationsNone, MdMailOutline } from "react-icons/md";
import { FaRegUser } from "react-icons/fa";
import axios from 'axios';

export default class navbar extends React.Component{
    state = {
        student: []
    }

    componentDidMount() {
        axios.get(`http://localhost:8080/api/v1/student/1`)
          .then(res => {
             
            this.setState({ student: res.data });
            console.log(this.state.student);
          })
    }

    render(){
        const {student} = this.state;
        return(
            <div className="navbar-component">
                
                <Navbar variant="dark">
                  <Navbar.Brand style={{fontSize: 30}}>Kimsquit</Navbar.Brand> 
                   
                        <Nav className="ml-auto">
                            <Navbar.Brand> {<MdNotificationsNone size={34}/> }</Navbar.Brand>  
                            <Navbar.Brand> {<MdMailOutline size={34}/> }</Navbar.Brand>  
                            <Navbar.Brand href="/ViewProfile" style={{fontSize: 23}}>{ student.firstName + ' ' + student.lastName }</Navbar.Brand>  
                            <Navbar.Brand href="/ViewProfile"> {<FaRegUser size={22}/> }</Navbar.Brand>  
                        </Nav>
                   

                </Navbar>
          
                
           </div>
        );
    }
}



