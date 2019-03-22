SUMMARY = "Collection of synthesizers and plugins"
HOMEPAGE = "http://distrho.sourceforge.net/ports"
LICENSE = "GPLv2 & MIT"
LIC_FILES_CHKSUM = " \
    file://ports/argotlunar/README.md;md5=81abc323be6ba481ab72864b53b3daca \
    file://ports/protoplug/license.txt;md5=56b9d913eb7c3ef00ca375ab614bf02f \
"

SRC_URI = " \
    git://github.com/DISTRHO/DISTRHO-Ports-Extra.git \
"
# TODO:
# argolunar: no sound (presets?)
# pdpulp: segfault
# protoplug asks for files

SRCREV = "b6f25f1feb4de49136844f20d88bec6439cdfbc5"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

REQUIRED_DISTRO_FEATURES = "x11 opengl"

inherit lv2-postinst-helper distro_features_check pack_audio_plugins

# distro-ports dependency for special hack script / libs 
DEPENDS += " \
    premake3-native \
    virtual/libgl \
    libx11 \
    libxext \
    libxcursor \
    freetype \
    csound \
    distrho-ports \
"

do_configure() {
    # reconfigure?
    if [ ! -f ${LV2-TURTLE-BUILD-DATA} ] ; then
        # Seems this collection is not ready for public - copy 'shared' from distrho-ports
        rm -rf ${S}/scripts
        rm -rf ${S}/libs
        cp -rf ${STAGING_LIBDIR}/distrho-ports-build/* ${S}/
	    # manipulate scripts to keep lv2_ttl_generator-calls in script for lv2-postinst-helper
        sed -i 's|$GEN ./$FILE|echo "lv2-ttl-generator `pwd`/$FILE" >> ${LV2-TURTLE-BUILD-DATA}|g' `find ${S}/scripts -name *.sh`
    else
        rm -f ${LV2-TURTLE-BUILD-DATA}
    fi

	cd ${S}
    # platforms supporting sse2 can override NOOPTIMIZATIONS
    NOOPTIMIZATIONS=1 ${S}/scripts/premake-update.sh linux
}

do_install() {
    install -d ${D}${libdir}
	cp -r ${S}/bin/* ${D}${libdir}
}

FILES_${PN} += " \
    ${libdir}/cabbage* \
"

# for common (?) cabbage files
RDEPENDS_${PN}-lv2 += "${PN}"
RDEPENDS_${PN}-vst += "${PN}"

# Have not found what causes stripping - debugging of plugins is unlikely
INSANE_SKIP_${PN} = "already-stripped"
