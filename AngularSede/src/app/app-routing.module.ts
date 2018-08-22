import { NgModule } from '@angular/core';
//import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import{FormularioComponent} from './formulario/formulario.component';
import { patch } from '../../node_modules/webdriver-js-extender';

const routes: Routes = [
  {path: '', redirectTo: '/sede', pathMatch: 'full'},
  { path: 'sede', component: FormularioComponent }
    
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
  
})
export class AppRoutingModule { }
