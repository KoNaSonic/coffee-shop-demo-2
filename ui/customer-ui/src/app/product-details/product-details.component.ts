import { Component, OnInit } from '@angular/core';
import {ProductRoutingHttpService} from "./http/product-routing-http.service";
import { ProductDetails } from "../model/productDetails/productDetails";
import {Subscription} from "rxjs";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  public productId: number;
  public productDetails: ProductDetails;
  private subscription: Subscription;

  constructor(private productRoutingHttpService: ProductRoutingHttpService, private activateRoute: ActivatedRoute) {
    this.subscription = activateRoute.params.subscribe(params=>this.productId = params['id']);
  }

  getProductDetails(productId: number) {
    return this.productRoutingHttpService.getProductDetailsById(productId).subscribe(data => this.productDetails = data);
  }

  ngOnInit() {
    this.getProductDetails(this.productId);
  }
}
