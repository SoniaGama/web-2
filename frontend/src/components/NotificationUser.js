import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import axios from 'axios';

class NotificationUser extends Component {
	render(){
		return(
			<div class="container">
				<div class="panel panel-default">
				
					<div class="panel-heading">
						<h3 class="panel-title">
							Usuario Registrado
						</h3>
					</div>
					
					<div class="panel-body">					
					<button><Link to='/logIn'>Iniciar Sesión</Link></button>
					</div>						
					
				</div>				
			</div>
				
				);
	}
}

export default NotificationUser;