// This is a generated file. Not intended for manual editing.
package com.intellij.plugin.powershell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PowerShellEnumDeclarationStatement extends PowerShellEnumDeclaration {

  @Nullable
  PowerShellAttribute getAttribute();

  @Nullable
  PowerShellBlockBody getBlockBody();

  @NotNull
  List<PowerShellComment> getCommentList();

  @NotNull
  PowerShellIdentifier getIdentifier();

}
