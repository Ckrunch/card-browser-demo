import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';
import { AppConfigService } from './app-config.service';
import {provideHttpClient} from '@angular/common/http';


import { routes } from './app.routes';

export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes), AppConfigService, provideHttpClient()]
};
