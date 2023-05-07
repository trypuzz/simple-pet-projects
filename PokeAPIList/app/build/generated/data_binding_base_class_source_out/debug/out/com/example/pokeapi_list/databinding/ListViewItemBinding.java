// Generated by data binding compiler. Do not edit!
package com.example.pokeapi_list.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.pokeapi_list.R;
import com.example.pokeapi_list.network.Pokemon;
import com.example.pokeapi_list.ui.PokemonListener;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListViewItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView amphibianName;

  @NonNull
  public final MaterialCardView card;

  @Bindable
  protected Pokemon mPokemon;

  @Bindable
  protected PokemonListener mClickListener;

  protected ListViewItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView amphibianName, MaterialCardView card) {
    super(_bindingComponent, _root, _localFieldCount);
    this.amphibianName = amphibianName;
    this.card = card;
  }

  public abstract void setPokemon(@Nullable Pokemon pokemon);

  @Nullable
  public Pokemon getPokemon() {
    return mPokemon;
  }

  public abstract void setClickListener(@Nullable PokemonListener clickListener);

  @Nullable
  public PokemonListener getClickListener() {
    return mClickListener;
  }

  @NonNull
  public static ListViewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_view_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListViewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListViewItemBinding>inflateInternal(inflater, R.layout.list_view_item, root, attachToRoot, component);
  }

  @NonNull
  public static ListViewItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_view_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListViewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListViewItemBinding>inflateInternal(inflater, R.layout.list_view_item, null, false, component);
  }

  public static ListViewItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListViewItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListViewItemBinding)bind(component, view, R.layout.list_view_item);
  }
}
