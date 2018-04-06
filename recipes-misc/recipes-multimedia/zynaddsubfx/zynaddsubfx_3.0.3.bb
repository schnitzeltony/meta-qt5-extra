SUMMARY = "ZynAddSubFX is an open source software synthesizer"
HOMEPAGE = "http://zynaddsubfx.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=21fa88a5e50a1c608d22612c1fbe1971"

inherit cmake lv2-postinst-helper pkgconfig gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    virtual/libx11 \
    alsa-lib \
    jack \
    portaudio-v19 \
    dssi \
    lv2 \
    liblo \
    zlib \
    fltk fltk-native \
    mxml \
    libxpm \
    ntk \
"

CXXFLAGS += "-ffast-math -DNDEBUG"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.bz2 \
    file://0001-No-target-specific-asm.patch \
    file://0002-Controller-Spliter-align-Makefiles-for-cross-compili.patch \
    file://0003-Nio.cpp-Do-not-use-ps-aux-to-find-jack-busybox-s-ps-.patch \
    file://0004-Keep-our-build-flags.patch \
    file://0005-Set-UI-optimization-to-O1-explicitly.patch \
"
SRC_URI[md5sum] = "66acae0913108f129aa979f3c4b65473"
SRC_URI[sha256sum] = "11de448f9664076e9e8f2bcb8f7f45bf54a13516b7d6693da1ef8c511b8ed7c1"


do_configure_prepend() {
    # reconfigure?
    if [ ! -f ${LV2-TURTLE-BUILD-DATA} ] ; then
        # We cannot run lv2-ttl-generator in cross environment so
        # manipulate CMakeLists.txt to keep commands in file
        sed -i 's|../../lv2-ttl-generator|lv2-ttl-generator|g' `find ${S} -name CMakeLists.txt`
        sed -i 's|lv2-ttl-generator $<TARGET_FILE.*|echo \"&\" >> ${LV2-TURTLE-BUILD-DATA}|g' `find ${S} -name CMakeLists.txt`
    else
        rm -f ${LV2-TURTLE-BUILD-DATA}
    fi
}

do_compile_append() {
    # Build Controller/Spliter
    oe_runmake -C ${S}/ExternalPrograms/Controller
    oe_runmake -C ${S}/ExternalPrograms/Spliter

    # Create dummy lv2-turtles to make install happy
    cd ${B}/src/Plugin/
    for dir in `find -type d -mindepth 1 -maxdepth 1`; do
        if [ -d $dir/lv2 ] ; then
            echo ${LV2-DUMMY-TURTLE-STR} > $dir/lv2/manifest.ttl
            echo ${LV2-DUMMY-TURTLE-STR} > $dir/lv2/presets.ttl
            for so in `find $dir -name '*.so' -mindepth 2 -maxdepth 2`; do
                pluginname=`basename $so | sed 's|.so||g'`
                echo ${LV2-DUMMY-TURTLE-STR} > $dir/lv2/$pluginname.ttl
            done
        fi
    done
}

do_install_append() {
    install -m 0755 ${S}/ExternalPrograms/Controller/controller ${D}${bindir}/zynaddsubfx-controller
    install -m 0755 ${S}/ExternalPrograms/Spliter/spliter ${D}${bindir}/zynaddsubfx-spliter
}

FILES_${PN} += " \
    ${libdir}/dssi \
    ${libdir}/lv2 \
    ${libdir}/vst \
"

