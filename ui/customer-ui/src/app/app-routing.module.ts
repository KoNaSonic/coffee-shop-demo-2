import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ExampleComponent} from "./example/example.component";
import {ProductDetailsComponent} from "./product-details/product-details.component";

const routes: Routes = [
  {path: '', component: ExampleComponent},
  {path: 'examples', component: ExampleComponent},
  {path: 'productDetails/:id', component: ProductDetailsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
