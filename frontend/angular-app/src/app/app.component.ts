import { Component } from '@angular/core';
import { CardComponent } from './card/card.component';
import { HttpClient } from '@angular/common/http';  // Import HttpClient
import { Observable } from 'rxjs';  // For handling the Observable response
import { AppConfigService } from './app-config.service';
import { CardResponse } from './card-response';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  imports: [CardComponent, NgIf]
})
export class AppComponent {
  // Card details to pass to the card component
  mtgCard = {
    cardName: '',
    cardImage: '',
    manaCost: '',
    cardType: '',
    cardText: '',
    powerToughness: ''
  };
  currentCardNumber: number = 0;
  apiUrl: string = '';

  constructor(private http: HttpClient, private configService: AppConfigService) {
    // Access the global variable from the service
    this.apiUrl = this.configService.apiUrl;
    //Initialize with the first card in the dataset
    this.getFirst();
  }

  assignCardData(cResp: CardResponse): void {
    this.mtgCard = {
      cardName: cResp.name ?? '',
      cardImage: cResp.imageurl ?? '',
      manaCost: cResp.manaCost ?? '',
      cardType: cResp.type ?? '',
      cardText: cResp.text ?? '',
      powerToughness: `${cResp.power ?? ''} / ${cResp.toughness ?? ''}`
    };

    this.currentCardNumber = cResp.listPosition;
  }

  // // Method to make GET request to /api/first
  getFirst(): void {
    this.http.get<CardResponse>(`${this.apiUrl}/first`)  // Make GET request to /api/first
      .subscribe(
        (response) => {
          console.log('Response from /api/first:', response);  // Handle success
          this.assignCardData(response)

        },
        (error) => {
          console.error('Error fetching data from /api/first:', error);  // Handle error
        }
      );
  }

  // // Method to make GET request to /api/first
  goToPrevious(): void {
    this.http.get<CardResponse>(`${this.apiUrl}/previous?listPosition=${this.currentCardNumber}`)  // Make GET request to /api/first
      .subscribe(
        (response) => {
          console.log('Response from /api/first:', response);  // Handle success
          this.assignCardData(response)

        },
        (error) => {
          console.error('Error fetching data from /api/first:', error);  // Handle error
        }
      );
  }

  // // Method to make GET request to /api/first
  goToNext(): void {
    this.http.get<CardResponse>(`${this.apiUrl}/next?listPosition=${this.currentCardNumber}`)  // Make GET request to /api/first
      .subscribe(
        (response) => {
          console.log('Response from /api/first:', response);  // Handle success
          this.assignCardData(response)

        },
        (error) => {
          console.error('Error fetching data from /api/first:', error);  // Handle error
        }
      );
  }

  // Method to make GET request to /api/first
  getLast(): void {
    this.http.get<CardResponse>(`${this.apiUrl}/last`)  // Make GET request to /api/first
      .subscribe(
        (response) => {
          console.log('Response from /api/last:', response);  // Handle success
          this.assignCardData(response)


        },
        (error) => {
          console.error('Error fetching data from /api/last:', error);  // Handle error
        }
      );
  }

  goToRandom(): void {
    this.http.get<CardResponse>(`${this.apiUrl}/random`)  // Make GET request to /api/first
      .subscribe(
        (response) => {
          console.log('Response from /api/random:', response);  // Handle success
          this.assignCardData(response)
        },
        (error) => {
          console.error('Error fetching data from /api/random:', error);  // Handle error
        }
      );
  }
}
