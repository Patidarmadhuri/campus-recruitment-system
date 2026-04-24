import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Student {
  id?: number;
  name: string;
  email: string;
  degree: string;
}

@Injectable()
export class StudentService {
  private api = 'http://localhost:8080/api/students';
  constructor(private http: HttpClient) {}
  list(): Observable<Student[]> {
    return this.http.get<Student[]>(this.api);
  }
  create(student: Student): Observable<Student> {
    return this.http.post<Student>(this.api, student);
  }
}