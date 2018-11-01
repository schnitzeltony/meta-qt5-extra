SUMMARY = "A C++ library for resampling audio signals"
HOMEPAGE = "http://kokkinizita.linuxaudio.org/linuxaudio/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit manpages

DEPENDS += " \
    ldconfig-native \
    gzip-native \
    libsndfile1 \
"

SRC_URI = " \
    http://kokkinizita.linuxaudio.org/linuxaudio/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-Align-Makefiles.patch \
"
SRC_URI[md5sum] = "9b2cff7fa419febbca3a13435b2a24b3"
SRC_URI[sha256sum] = "233baefee297094514bfc9063e47f848e8138dc7c959d9cd957b36019b98c5d7"

# for builing apps
CXXFLAGS+=" -I../source"
LDFLAGS+=" -L../source"

do_compile() {
    cd ${S}/source
    base_do_compile

    # create lib link for building apps
    ln -sf lib${BPN}.so.${PV} lib${BPN}.so

    cd ${S}/apps
    base_do_compile
}

do_install() {
    cd ${S}/source
	oe_runmake 'DESTDIR=${D}' 'LIBDIR=${libdir}' 'INCDIR=${includedir}' install

    cd ${S}/apps
	oe_runmake 'DESTDIR=${D}' 'BINDIR=${bindir}' 'MANDIR=${mandir}' install
}
