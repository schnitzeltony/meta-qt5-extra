SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/release/Path-Tiny"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README;beginline=1119;endline=1124;md5=63fd8b3ccdda43923b352a880cb37e36"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "1a7fbdccc4585074ce4419b7bec0966c"
SRC_URI[sha256sum] = "3c49482be2b3eb7ddd7e73a5b90cff648393f5d5de334ff126ce7a3632723ff5"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
