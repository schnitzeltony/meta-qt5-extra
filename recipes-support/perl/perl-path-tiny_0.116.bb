SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/release/Path-Tiny"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a801633f1c5bd3f1f7aa60bc72e95df9"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[sha256sum] = "0379108b2aee556f877760711e03ce8775a98859cdd03cb94aaf4738a37a62d3"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
