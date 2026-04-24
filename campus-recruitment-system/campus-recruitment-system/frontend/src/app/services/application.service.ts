import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class ApplicationService {
  private api = 'http://localhost:8080/api/applications';
  constructor(private http: HttpClient) {}
  /**
   * Apply a student to a job.
   */
  apply(studentId: number, jobId: number): Observable<any> {
    const params = new HttpParams().set('studentId', studentId).set('jobId', jobId);
    return this.http.post<any>(`${this.api}/apply`, null, { params });
  }
}