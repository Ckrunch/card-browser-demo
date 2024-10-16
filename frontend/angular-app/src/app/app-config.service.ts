import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppConfigService {

  // Define your global variable here
  public apiUrl: string = 'http://localhost:8080/api';
  constructor() { }
  getApiUrl(): string {
    return this.apiUrl;
  }
}
