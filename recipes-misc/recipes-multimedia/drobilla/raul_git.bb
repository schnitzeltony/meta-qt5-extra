SUMMARY = "Raul is a utility library primarily aimed at audio/musical applications"
DESCRIPTION = "Raul (Realtime Audio Utility Library) is a C++ utility library primarily aimed at audio/musical applications"
HOMEPAGE = "https://drobilla.net/software/raul"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit waf

SRC_URI = "git://github.com/drobilla/raul.git"
SRCREV = "5eb7a555de2291f4df8c75ce261c555552725beb"
S = "${WORKDIR}/git"
PV = "0.8.10+git${SRCPV}"
