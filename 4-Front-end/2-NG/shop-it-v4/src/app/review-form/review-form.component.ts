import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent implements OnInit {

  isFormOpen = false
  reviewForm: FormGroup

  @Output() newReview = new EventEmitter();

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.reviewForm = this.fb.group({
      rating: [5],
      author: ['', [Validators.required, Validators.email]],
      body: ['', [Validators.required, Validators.minLength(3)]]
    });
  }

  toggleForm() {
    this.isFormOpen = !this.isFormOpen;
    if (!this.isFormOpen)
      this.reviewForm.reset();
  }

  handleSubmit() {
    if (this.reviewForm.valid) {
      let formData = this.reviewForm.value;
      this.newReview.emit({ formData });
      this.reviewForm.reset();
      this.toggleForm();
    }
  }

} 
