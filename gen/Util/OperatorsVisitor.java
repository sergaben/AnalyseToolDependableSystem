// Generated from D:/Windows Desktop/Stuff/University Stuff/Year 3/Dependable Systems/Coursework - CV/analysisToolCoursework/AnalyseToolDependableSystem/src/main/java/Util\Operators.g4 by ANTLR 4.7
package Util;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OperatorsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OperatorsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(OperatorsParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(OperatorsParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(OperatorsParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(OperatorsParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(OperatorsParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(OperatorsParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(OperatorsParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(OperatorsParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(OperatorsParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(OperatorsParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(OperatorsParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(OperatorsParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(OperatorsParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(OperatorsParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(OperatorsParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(OperatorsParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(OperatorsParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(OperatorsParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(OperatorsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(OperatorsParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(OperatorsParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(OperatorsParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(OperatorsParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(OperatorsParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(OperatorsParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(OperatorsParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(OperatorsParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(OperatorsParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(OperatorsParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(OperatorsParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(OperatorsParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(OperatorsParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(OperatorsParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(OperatorsParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(OperatorsParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(OperatorsParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(OperatorsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(OperatorsParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(OperatorsParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(OperatorsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(OperatorsParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(OperatorsParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(OperatorsParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(OperatorsParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(OperatorsParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(OperatorsParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(OperatorsParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(OperatorsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(OperatorsParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(OperatorsParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(OperatorsParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(OperatorsParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(OperatorsParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(OperatorsParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(OperatorsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(OperatorsParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(OperatorsParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(OperatorsParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(OperatorsParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(OperatorsParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(OperatorsParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(OperatorsParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(OperatorsParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OperatorsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(OperatorsParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(OperatorsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(OperatorsParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OperatorsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(OperatorsParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(OperatorsParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(OperatorsParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(OperatorsParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#tryStatementNoResources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatementNoResources(OperatorsParser.TryStatementNoResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#tryStatementWithResources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatementWithResources(OperatorsParser.TryStatementWithResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(OperatorsParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(OperatorsParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(OperatorsParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(OperatorsParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(OperatorsParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(OperatorsParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(OperatorsParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(OperatorsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(OperatorsParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(OperatorsParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(OperatorsParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(OperatorsParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(OperatorsParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(OperatorsParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(OperatorsParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(OperatorsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(OperatorsParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(OperatorsParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(OperatorsParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(OperatorsParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(OperatorsParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(OperatorsParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(OperatorsParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(OperatorsParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(OperatorsParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(OperatorsParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(OperatorsParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(OperatorsParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(OperatorsParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(OperatorsParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(OperatorsParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(OperatorsParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(OperatorsParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(OperatorsParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(OperatorsParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(OperatorsParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperatorsParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(OperatorsParser.ArgumentsContext ctx);
}