import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { StudentService } from './services/student.service';
import { CompanyService } from './services/company.service';
import { JobService } from './services/job.service';
import { ApplicationService } from './services/application.service';
import { InterviewService } from './services/interview.service';

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, FormsModule, HttpClientModule],
  providers: [StudentService, CompanyService, JobService, ApplicationService, InterviewService],
  bootstrap: [AppComponent]
})
export class AppModule {}