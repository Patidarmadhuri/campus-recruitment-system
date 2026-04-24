import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Company {
  id?: number;
  name: string;
  description: string;
}

@Injectable()
export class CompanyService {
  private api = 'http://localhost:8080/api/companies';
  constructor(private http: HttpClient) {}
  list(): Observable<Company[]> {
    return this.http.get<Company[]>(this.api);
  }
  create(company: Company): Observable<Company> {
    return this.http.post<Company>(this.api, company);
  }
}