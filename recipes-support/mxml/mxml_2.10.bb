SUMMARY = "Mini-XML is a small XML library"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a6ba38606d63bb042c5d8cfee182e120"

DEPENDS = ""

SRC_URI = " \
    http://www.msweet.org/files/project3/${BPN}-${PV}.tar.gz \
    file://0001-avoid-testing-library-in-cross-environments.patch \
    file://0002-don-t-loose-our-LDFLAGS.patch \
"
SRC_URI[md5sum] = "8804c961a24500a95690ef287d150abe"
SRC_URI[sha256sum] = "267ff58b64ddc767170d71dab0c729c06f45e1df9a9b6f75180b564f09767891"

inherit autotools-brokensep

EXTRA_AUTORECONF += "--exclude=autoheader"

do_install() {
    install -d ${D}${includedir}
    install -m 644 mxml.h ${D}${includedir}

    install -d ${D}${libdir}/pkgconfig
    install -m 644 libmxml.so.1.5 ${D}${libdir}
	ln -s libmxml.so.1.5 ${D}${libdir}/libmxml.so
	ln -s libmxml.so.1.5 ${D}${libdir}/libmxml.so.1

    install mxml.pc ${D}${libdir}/pkgconfig
}
