import { Component, OnInit } from '@angular/core';
import { Job, JobService } from './services/job.service';
import { Student, StudentService } from './services/student.service';
import { ApplicationService } from './services/application.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent implements OnInit {
  jobs: Job[] = [];
  students: Student[] = [];
  selectedStudent?: Student;
  message?: string;
  loading = false;

  constructor(
    private jobService: JobService,
    private studentService: StudentService,
    private applicationService: ApplicationService
  ) {}

  ngOnInit() {
    this.loadJobs();
    this.loadStudents();
  }

  loadJobs() {
    this.loading = true;
    this.jobService.list().subscribe({
      next: jobs => {
        this.jobs = jobs;
        this.loading = false;
      },
      error: () => {
        this.loading = false;
      }
    });
  }

  loadStudents() {
    this.studentService.list().subscribe(students => this.students = students);
  }

  apply(job: Job) {
    if (!this.selectedStudent) {
      this.message = 'Bitte wählen Sie einen Studenten aus.';
      return;
    }
    this.applicationService.apply(this.selectedStudent.id!, job.id!).subscribe(() => {
      this.message = `Bewerbung für ${job.title} wurde eingereicht.`;
    });
  }
}