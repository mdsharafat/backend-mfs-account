package com.mfs.account.entity;

import com.mfs.account.domain.BaseDomain;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "AG_DH_MAPPING")
@AllArgsConstructor
@NoArgsConstructor
public class AgDhMappingEntity extends BaseDomain {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AgDhMapSeqGenerator")
    @SequenceGenerator(name = "AgDhMapSeqGenerator", sequenceName = "AG_DH_MAP_SEQ_GEN")
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "AGENT_ID")
    @NonNull
    private String agentId;

    @Column(name = "DISTRIBUTOR_ID")
    @NonNull
    private String distributorId;

}
