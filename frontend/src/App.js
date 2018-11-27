import React, { Component } from 'react';
//import ReactDOM from 'react-dom';
import {Link} from 'react-router-dom';
import axios from 'axios';

class App extends Component {
	
	constructor(props){
		super(props);
		this.state = {
				users:[]
		};
	}
	
	componentDidMount(){
		axios.get('/users')
			.then(response => {
				this.setState({users: response.data});
				console.log(this.state.users);
			});
	}
		
  render() {
    return (
    		
    	<div class="container">
          <div class="panel panel-default">
             <div class="panel-heading">
                <h3 class="panel-title">
                  User List
                </h3>
              </div>
              <div class="panel-body">
                <h4><Link to="/create">Add User</Link></h4>
                <table class="table table-stripe">
                  <thead>
                    <tr>
                      <th>Name</th>
                      <th>Address</th>
                    </tr>
                  </thead>
                  <tbody>
                    {this.state.users.map(result =>
                      <tr>
                        <td><Link to={`/show/${result.id}`}>{result.name}</Link></td>
                        <td>{result.address}</td>
                      </tr>
                    )}
                  </tbody>
                </table>
              </div>
            </div>
          </div>
    		  	
    );
  }
}

export default App;
