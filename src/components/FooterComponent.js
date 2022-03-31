import React from "react";
import { MDBCol, MDBContainer, MDBRow, MDBFooter } from "mdbreact";

const FooterPage = () => {
    return (
      <MDBFooter color="black" className="font-small pt-4 mt-4 footer fixed-bottom">
        <div className="container">
        
        </div>
        <div className="footer-copyright text-center py-3">
        <MDBContainer fluid>
            &copy; {new Date().getFullYear()} Copyright: <a href=""> Akram Hussain</a>
          </MDBContainer>
        </div>
      </MDBFooter>
    );
  }
export default class FooterComponent extends React.Component {
    

    render() {
        return (
            FooterPage()
        )
    }
}