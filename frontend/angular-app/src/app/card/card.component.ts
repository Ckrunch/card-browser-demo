import { NgIf } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-card',
  standalone: true,
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
  imports: [NgIf]
})
export class CardComponent {
  // Input properties to pass card data from a parent component
  @Input() cardName : string = 'Sample Card Name';
  @Input() cardImage: string = 'https://via.placeholder.com/150'; // Default placeholder
  @Input() manaCost: string = '5';
  @Input() cardType: string = 'Artifact';
  @Input() cardText: string = 'This is the card description or special abilities.';
  @Input() powerToughness: string = '3 / 3'; // For creatures only
}
