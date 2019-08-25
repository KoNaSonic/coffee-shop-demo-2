export class Products {

  private _productId: number;
    private _quantity: number;

  constructor(productId: number, weight: number, quantity: number) {
    this._productId=productId;
    this._quantity=quantity;
  }

  get productId(): number {
    return this._productId;
  }

  set productId(value: number) {
    this._productId = value;
  }

  get quantity(): number {
    return this._quantity;
  }

  set quantity(value: number) {
    this._quantity = value;
  }
}
