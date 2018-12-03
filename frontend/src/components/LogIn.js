// link to show
import React, { Component } from 'react';
import {Link} from 'react-router-dom';
import axios from 'axios';

class LogIn extends Component {
	
	onSubmit = (e) => {
		e.preventDefault(); 		
		const {name, password} = this.state.user;
	}
	
	render(){
		return(
			<div class="container">
			  
			  <div class="panel panel-default">
				
			    <div class="panel-heading">
					<h3 class="panel-title">
						LogIn
					</h3>
				</div>
				
				<div class="panel-body">					
					<form onSubmit={this.onSubmit}>
					
					  <div class="form-group">
					    <label for="email">Email address</label>
					    <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="example@email.com"/>
					  </div>
					    
					  <div class="form-group">
					    <label for="password">Password</label>
					    <input type="password" class="form-control" id="password" placeholder="Password"/>
					  </div>
					  
					  <button type="submit" class="btn btn-default">Submit</button>
					  <button><Link to='/'>Salir</Link></button>
					  
					</form>
					
				</div>
			  </div>					
			</div>
				
				);
	}
	
	
}

export default LogIn;