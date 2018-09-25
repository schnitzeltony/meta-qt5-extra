SUMMARY = "Real-time Midi I/O Library"
HOMEPAGE = "http://portmedia.sourceforge.net"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.txt;md5=a0c1c261bc48165d48388e3a121a31e9"

inherit cmake dos2unix

DEPENDS += " \
    alsa-lib \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/portmedia/${BPN}/${PV}/${BPN}-src-${PV}.zip \
    file://fedora-portmidi-cmake.patch \
    file://0001-do-not-build-java-application-to-set-midi-defaults.patch \
    file://0002-fix-compilation-du-to-unkown-functions.patch \
    file://0003-fix-format-security..patch \
"
SRC_URI[md5sum] = "03f46fd3947e2ef4c8c465baaf832241"
SRC_URI[sha256sum] = "08e9a892bd80bdb1115213fb72dc29a7bf2ff108b378180586aa65f3cfd42e0f"

S = "${WORKDIR}/${BPN}"

EXTRA_OECMAKE += " \
    -DLIB_INSTALL_DIR=${libdir} \
    -DINCLUDE_INSTALL_DIR=${includedir} \
    -DCMAKE_ARCHIVE_OUTPUT_DIRECTORY=Release \
    -DCMAKE_LIBRARY_OUTPUT_DIRECTORY=Release \
    -DCMAKE_RUNTIME_OUTPUT_DIRECTORY=Release \
"

do_install_append() {
    ln -s libportmidi.so.0. "${D}/${libdir}/libporttime.so"
    ln -s libportmidi.so.0. "${D}/${libdir}/libporttime.so.0"
    ln -s libportmidi.so.0. "${D}/${libdir}/libporttime.so.0."
}
