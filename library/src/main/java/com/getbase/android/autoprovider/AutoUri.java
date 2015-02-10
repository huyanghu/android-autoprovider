package com.getbase.android.autoprovider;

import com.google.common.base.Optional;

import android.net.Uri;

import java.util.Collection;

public interface AutoUri {
  Uri toUri();

  ModelUri getModelUri();

  Class<?> getModel();

  Collection<EntityUri> getRelatedEntities();

  Optional<EntityUri> getRelatedEntity(Class<?> model);

  <T> T accept(AutoUriVisitor<T> visitor);
}