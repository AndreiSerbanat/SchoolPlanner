package com.example.schoolplanner.ui.grades;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.schoolplanner.databinding.FragmentGradesBinding;

public class GradesFragment extends Fragment {

    private FragmentGradesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GradesViewModel timetableViewModel =
                new ViewModelProvider(this).get(GradesViewModel.class);

        binding = FragmentGradesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textGrades;
        //timetableViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}