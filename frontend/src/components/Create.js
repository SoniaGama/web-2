import React, {Component} from 'react';
//import ReactDOM from 'react-dom';
import {Link} from 'react-router-dom';
import axios from 'axios';

//link to notification "usuaro registrado" .js component
//link to LogIn

class Create extends Component {
	constructor(){
		super();
		this.state = {
				name: '',
				address: '',
				city: '',
				phone: '',
				email: ''
		};
	}
	
	// cuando detecta un cambio de estado
	onChange = (e) => {
		const state = this.state;
		state[e.target.name] = e.target.value;
		this.setState(state);
		
		console.log(e);
		console.log(this.state);
	}
	
	// envia
	onSubmit = (e) => {
		e.preventDefault();
		const {name, address, city, phone, email} = this.state;
				
		console.log(e);
		console.log(this.state);
		
		axios.post('./users', { name, address, city, phone, email })
			.then(result => this.props.history.push("/"));
	}
		
		render(){
			const {name, address, city, phone, email} = this.state;
			
			return(
					
					<div class="container">					
						<div class="panel panel-default">
						
							<div class="panel-heading">
								<h3 class="panel-title">
									Create User
								</h3>
							</div>
							
							<div class="panel-body">
								//<h4><Link to='/'>Users List</Link></h4>
								<form onSubmit={this.onSubmit}>
								
									<div class="form-group">										
										<label for="name">Name:</label>
										<input type="text" class="form-control" name="name" value={name} id="name" onChange={this.onChange} placeholder="Name"/>
									</div>
										
									<div class="form-group">
										<label for="address">Address:</label>
										<input type="text" class="form-control" name="address" value={address} id="address" onChange={this.onChange} placeholder="Address"/>
									</div>
									
									<div class="form-group">
										<label for="city">City:</label>
										<input type="text" class="form-control" name="city" value={city} id="city" onChange={this.onChange} placeholder="City"/>
									</div>
									
									<div class="form-group">
										<label for="phone">Phone:</label>
										<input type="text" class="form-control" name="phone" value={phone} id="phone" onChange={this.onChange} placeholder="Phone"/>
									</div>
									
									<div class="form-group">
										<label for="email">Email:</label>
										<input type="text" class="form-control" name="email" value={email} id="email" onChange={this.onChange} placeholder="Email"/>
									</div>
										
									<button type="submit" class="btn btn-default"><Link to='/notificationUser'>Submit</Link></button>
									<button><Link to='/'>Salir</Link></button>
								</form>
							</div>
							
						</div>
					</div>
					);
		}		
		
	}
	
export default Create;