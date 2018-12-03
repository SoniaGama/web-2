import React from 'react';
import ReactDOM from 'react-dom';
import {BrowserRouter as Router, Route} from 'react-router-dom';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import App from './App';
import './App.css';
import Edit from './components/Edit';
import Create from './components/Create';
import Show from './components/Show';
import Notification from './components/NotificationUser';
import LogIn from './components/LogIn';

ReactDOM.render(		
		<Router>
			<div>
				<Route exact path='/' component={App} />
				<Route path='/edit/:id' component={Edit} />
				<Route path='/create' component={Create} />
				<Route path='/show/:id' component={Show} />
				<Route path ='/notificationUser' component={Notification} />"
				<Route path = '/logIn' component={LogIn} />
			</div>
		</Router>,
		document.getElementById('root')
		
		//<App />, document.getElementById('root')
		);

