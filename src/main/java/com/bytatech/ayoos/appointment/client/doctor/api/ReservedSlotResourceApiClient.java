package com.bytatech.ayoos.appointment.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.bytatech.ayoos.appointment.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url}", configuration = ClientConfiguration.class)
public interface ReservedSlotResourceApiClient extends ReservedSlotResourceApi {
}