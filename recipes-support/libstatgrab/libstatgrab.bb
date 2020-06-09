SUMMARY = "libstatgrab provides access to statistics about the system"
HOMEPAGE = "https://libstatgrab.org/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/libstatgrab/libstatgrab.git"
SRCREV = "fa7e1d9fe76c3a1a7ade264c746b3f5edc566f3b"
PV = "0.92"
S = "${WORKDIR}/git"

DEPENDS = "ncurses"

inherit autotools pkgconfig

# did not get man build to fly
EXTRA_OECONF = "--disable-man"

RDEPENDS_${PN} += "perl"
