SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/release/Path-Tiny"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

PV = "0.130"
SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"
SRC_URI[sha256sum] = "74109aec04ddd83d80ee14a5346e8bc3e3f4673238e1c7358693bff348196c13"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
