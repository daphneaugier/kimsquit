import React from 'react';
import { Navbar, Nav} from 'react-bootstrap';
import { MdNotificationsNone, MdMailOutline } from "react-icons/md";
import { FaRegUser } from "react-icons/fa";

export default class navbar extends React.Component{
    render(){
        return(
            <div className="navbar-component" >
                
                <Navbar variant="dark">
                  <Navbar.Brand style={{fontSize: 30}}>Kimsquit</Navbar.Brand> 
                   
                        <Nav className="ml-auto">
                            <Navbar.Brand> {<MdNotificationsNone size={34}/> }</Navbar.Brand>  
                            <Navbar.Brand> {<MdMailOutline size={34}/> }</Navbar.Brand>  
                            <Navbar.Brand href="/ViewProfile" style={{fontSize: 23}}>User's name</Navbar.Brand>  
                            <Navbar.Brand href="/ViewProfile"> {<FaRegUser size={22}/> }</Navbar.Brand>  
                        </Nav>
                   

                </Navbar>
          
                
           </div>
        );
    }
}



