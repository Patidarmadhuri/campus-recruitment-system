import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Company } from './company.service';

export interface Job {
  id?: number;
  title: string;
  description: string;
  postedDate?: string;
  company?: Company;
}

@Injectable()
export class JobService {
  private api = 'http://localhost:8080/api/jobs';
  constructor(private http: HttpClient) {}
  list(): Observable<Job[]> {
    return this.http.get<Job[]>(this.api);
  }
  create(job: Job): Observable<Job> {
    return this.http.post<Job>(this.api, job);
  }
}