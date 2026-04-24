import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class InterviewService {
  private api = 'http://localhost:8080/api/interviews';
  constructor(private http: HttpClient) {}
  /**
   * Schedule an interview.
   */
  schedule(applicationId: number, scheduledAt: string, location: string): Observable<any> {
    const params = new HttpParams()
      .set('applicationId', applicationId)
      .set('scheduledAt', scheduledAt)
      .set('location', location);
    return this.http.post(`${this.api}/schedule`, null, { params });
  }
}