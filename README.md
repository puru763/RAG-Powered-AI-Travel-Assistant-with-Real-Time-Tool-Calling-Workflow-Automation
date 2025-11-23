# Contextual Multi-Model Integration Platform

This project provides a modular Spring Boot framework that integrates Large Language Models into traditional enterprise microservices. It uses Spring AI to enable seamless connectivity with multiple AI providers and supports Retrieval-Augmented Generation through vector databases.

The platform is built as a travel booking service that demonstrates how AI can be integrated into real-world business applications. It handles travel bookings, provides intelligent travel recommendations, and uses contextual understanding to assist users with their travel planning needs.

## Key Capabilities

**Multi-Model Support**

Integrates with multiple LLM providers like OpenAI through Spring AI, allowing easy switching between models without code rewrites. The architecture supports different AI providers through a unified interface.

**Retrieval-Augmented Generation (RAG)**

Uses vector databases such as Qdrant for embedding storage and similarity search. This enables context-aware responses by retrieving relevant travel information from a knowledge base before generating answers.

**Agent-Based Function Execution**

Configures LLMs as agents that can trigger predefined Java backend functions to execute multi-step business workflows. For example, the travel assistant can create bookings, check booking status, and update reservations through tool calls.

**Type-Safe Output Handling**

Maps LLM responses into strongly-typed Java POJOs for reliability and maintainability. This ensures that AI-generated content is validated and structured according to the application's domain model.

## Travel Platform Features

The service includes travel booking management with support for flights, hotels, packages, and car rentals. It provides intelligent travel recommendations based on destination data and user preferences. The system maintains conversation context to deliver personalized assistance throughout the booking process.

## Technology Stack

Built with Spring Boot 3.5.3 and Spring AI 1.0.0. Uses Qdrant for vector storage, H2 for chat memory persistence, and includes observability tools like Prometheus, Grafana, and Jaeger for monitoring and tracing.
