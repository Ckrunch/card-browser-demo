import { Identifiers } from "./card-identifiers";

export type CardResponse = {
        manaCost?: string;
        manaValue?: number;
        name?: string;
        power?: string;
        text?: string;
        toughness?: string;
        type?: string;
        imageurl?: string;
        powertoughness?: string;
        identifiers: Identifiers;
        listPosition: number;
}