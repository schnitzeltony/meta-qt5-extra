SUMMARY = "Hydrogen is an advanced drum machine for GNU/Linux"
HOMEPAGE = "http://www.hydrogen-music.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

# Note for LADSPA: If I read cmakeFindLadspa.cmake correctly, LASPA plugins
# available are searched during build process. Since I have no idea which
# plugins are useful for hydrogen (maybe caps??)  and all those have to go to
# RDEPEND LASPA support is skipped - althogh mentioned as 'desired' in config
# log. If it turns out that LADSPA is required, we need ladspa-sdk-native for 
# 'listplugins' tool.

DEPENDS += " \
    qttools-native \
    qtbase \
    qtxmlpatterns \
    libtar \
    libarchive \
    libsndfile1 \
    alsa-lib \
    liblo \
    jack \
    portaudio-v19 \
    portmidi \
    lrdf \
    pulseaudio \
    rubberband \
    cppunit \
"

# drumkits URIs from http://hydrogen-music.org/feeds/drumkit_list.php (downloaded to WORKDIR)
# NOTES: 
# * Licenses are included in drumkit_list.php
# * download of drumkits might fail -> repeat builds of this recipe usually helps

SRC_URI = " \
    git://github.com/hydrogen-music/hydrogen.git \
    file://0001-hydrogen.default.conf-do-not-show-developer-warnings.patch \
    file://0002-Fix-man-installation-path.patch \
    \
    http://hydrogen-music.org/feeds/drumkit_list.php;name=drumkit-list \
    \
    http://hydro.smoors.de/Audiophob.h2drumkit;downloadfilename=Audiophob.tar.gz;name=Audiophob;subdir=drumkits \
    http://hydro.smoors.de/belofilms_GuitarStrums.h2drumkit;downloadfilename=belofilms_GuitarStrums.tar.gz;name=belofilms_GuitarStrums;subdir=drumkits \
    https://sourceforge.net/projects/hydrogen/files/Sound%20Libraries/Main%20sound%20libraries/BJA_Pacific.h2drumkit;downloadfilename=BJA_Pacific.tar.gz;name=BJA_Pacific;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/Boss_DR-110.h2drumkit;downloadfilename=Boss_DR-110.tar.gz;name=Boss_DR-110;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/3355606kit.h2drumkit;downloadfilename=3355606kit.tar.gz;name=3355606kit;subdir=drumkits \
    https://downloads.sourceforge.net/project/hydrogen/Sound%20Libraries/Main%20sound%20libraries/Classic-626.h2drumkit;downloadfilename=Classic-626.tar.gz;name=Classic-626;subdir=drumkits \
    https://downloads.sourceforge.net/project/hydrogen/Sound%20Libraries/Main%20sound%20libraries/Classic-808.h2drumkit;downloadfilename=Classic-808.tar.gz;name=Classic-808;subdir=drumkits \
    https://sourceforge.net/projects/hydrogen/files/Sound%20Libraries/Main%20sound%20libraries/circAfrique%20v4.h2drumkit;downloadfilename=circAfrique-v4.tar.gz;name=circAfrique_v4;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/ColomboAcousticDrumkit.h2drumkit;downloadfilename=ColomboAcousticDrumkit.tar.gz;name=ColomboAcousticDrumkit;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/YamahaVintageKit.h2drumkit;downloadfilename=YamahaVintageKit.tar.gz;name=YamahaVintageKit;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/DeathMetal.h2drumkit;downloadfilename=DeathMetal.tar.gz;name=DeathMetal;subdir=drumkits \
    http://hydro.smoors.de/Denon%20CRB-90.h2drumkit;downloadfilename=Denon-CRB-90.tar.gz;name=Denon-CRB-90;subdir=drumkits \
    http://hydro.smoors.de/Drumkit%20excepcional.h2drumkit;downloadfilename=Drumkit_excepcional.tar.gz;name=Drumkit_excepcional;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/EasternHop-1.h2drumkit;downloadfilename=EasternHop-1.tar.gz;name=EasternHop-1;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/ElectricEmpireKit.h2drumkit;downloadfilename=ElectricEmpireKit.tar.gz;name=ElectricEmpireKit;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/ErnysPercussion.h2drumkit;downloadfilename=ErnysPercussion.tar.gz;name=ErnysPercussion;subdir=drumkits \
    https://sourceforge.net/projects/hydrogen/files/Sound%20Libraries/Main%20sound%20libraries/ForzeeStereo.h2drumkit;downloadfilename=ForzeeStereo.tar.gz;name=ForzeeStereo;subdir=drumkits \
    https://sourceforge.net/projects/hydrogen/files/Sound%20Libraries/Main%20sound%20libraries/Gimme%20A%20Hand%201.0.h2drumkit;downloadfilename=Gimme_A_Hand_1_0.tar.gz;name=Gimme_A_Hand_1_0;subdir=drumkits \
    http://hydro.smoors.de/Flac_GSCW-1.h2drumkit;downloadfilename=Flac_GSCW-1.tar.gz;name=Flac_GSCW-1;subdir=drumkits \
    http://hydro.smoors.de/Flac_GSCW-2.h2drumkit;downloadfilename=Flac_GSCW-2.tar.gz;name=Flac_GSCW-2;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/HardElectro1.h2drumkit;downloadfilename=HardElectro1.tar.gz;name=HardElectro1;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/HipHop-1.h2drumkit;downloadfilename=HipHop-1.tar.gz;name=HipHop-1;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/HipHop-2.h2drumkit;downloadfilename=HipHop-2.tar.gz;name=HipHop-2;subdir=drumkits \
    https://sourceforge.net/projects/hydrogen/files/Sound%20Libraries/Main%20sound%20libraries/K-27_Trash_Kit.h2drumkit;downloadfilename=K-27_Trash_Kit.tar.gz;name=K-27_Trash_Kit;subdir=drumkits \
    http://sourceforge.net/projects/hydrogen/files/Sound%20Libraries/Main%20sound%20libraries/Lightning1024.h2drumkit;downloadfilename=Lightning1024.tar.gz;name=Lightning1024;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/Millo-Drums_v.1.h2drumkit;downloadfilename=Millo-Drums_v_1.tar.gz;name=Millo-Drums_v_1;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/Millo_MultiLayered2.h2drumkit;downloadfilename=Millo_MultiLayered2.tar.gz;name=Millo_MultiLayered2;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/Millo_MultiLayered3.h2drumkit;downloadfilename=Millo_MultiLayered3.tar.gz;name=Millo_MultiLayered3;subdir=drumkits \
    http://hydro.smoors.de/Roland_MC-307_CR78&Cheaps.h2drumkit;downloadfilename=Roland_MC-307_CR78_Cheaps.tar.gz;name=Roland_MC-307_CR78_Cheaps;subdir=drumkits \
    http://hydro.smoors.de/Roland_MC-307_TR-606.h2drumkit;downloadfilename=Roland_MC-307_TR-606.tar.gz;name=Roland_MC-307_TR-606;subdir=drumkits \
    http://hydro.smoors.de/Roland_MC-307_TR-808.h2drumkit;downloadfilename=Roland_MC-307_TR-808.tar.gz;name=Roland_MC-307_TR-808;subdir=drumkits \
    http://hydro.smoors.de/Roland_MC-307_TR-909.h2drumkit;downloadfilename=Roland_MC-307_TR-909.tar.gz;name=Roland_MC-307_TR-909;subdir=drumkits \
    http://hydro.smoors.de/Roland_MC-307_Techno1.h2drumkit;downloadfilename=Roland_MC-307_Techno1.tar.gz;name=Roland_MC-307_Techno1;subdir=drumkits \
    http://hydro.smoors.de/rumpf_kit_z01_h2.h2drumkit;downloadfilename=rumpf_kit_z01_h2.tar.gz;name=rumpf_kit_z01_h2;subdir=drumkits \
    https://sourceforge.net/projects/hydrogen/files/Sound%20Libraries/Main%20sound%20libraries/SF3007-2011-Set-03.h2drumkit;downloadfilename=SF3007-2011-Set-03.tar.gz;name=SF3007-2011-Set-03;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/Synthie-1.h2drumkit;downloadfilename=Synthie-1.tar.gz;name=Synthie-1;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/TD-7kit.h2drumkit;downloadfilename=TD-7kit.tar.gz;name=TD-7kit;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/Techno-1.h2drumkit;downloadfilename=Techno-1.tar.gz;name=Techno-1;subdir=drumkits \
    https://sourceforge.net/projects/hydrogen/files/Sound%20Libraries/Main%20sound%20libraries/The%20Black%20Pearl%201.0.h2drumkit;downloadfilename=The_Black_Pearl_1_0.tar.gz;name=The_Black_Pearl_1_0;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/TR808909.h2drumkit;downloadfilename=TR808909.tar.gz;name=TR808909;subdir=drumkits \
    https://downloads.sourceforge.net/hydrogen/VariBreaks.h2drumkit;downloadfilename=VariBreaks.tar.gz;name=VariBreaks;subdir=drumkits \
    \
    https://freewavesamples.com/files/KawaiXD-5Kit.h2drumkit;downloadfilename=KawaiXD-5Kit.tar.gz;name=KawaiXD-5Kit;subdir=drumkits \
    https://freewavesamples.com/files/RolandJD-990Kit.h2drumkit;downloadfilename=RolandJD-990Kit.tar;name=RolandJD-990Kit;subdir=drumkits \
    https://freewavesamples.com/files/YamahaRX15Kit.h2drumkit;downloadfilename=YamahaRX15Kit.tar.gz;name=YamahaRX15Kit;subdir=drumkits \
    https://freewavesamples.com/files/YamahaTG-55Kit.h2drumkit;downloadfilename=YamahaTG-55Kit.tar.gz;name=YamahaTG-55Kit;subdir=drumkits \
"
SRCREV = "538eaeb9f4e9be2febf02e36a08e3e9fca2ae317"
PV ="1.0.0~beta1+git${SRCPV}"

S = "${WORKDIR}/git"

SRC_URI[drumkit-list.md5sum] = "d7c54dba04092112fb012c1a0acc6404"
SRC_URI[drumkit-list.sha256sum] = "c4ddfcff63e57e72ab376a9b85a1fdf7ba47ec244dcca45ab95984adfd585780"

SRC_URI[Audiophob.md5sum] = "24cb2577a447bbd72aab769aacb3e8b4"
SRC_URI[Audiophob.sha256sum] = "70b71304221a1287f257ed9a03bfb221af6ce335deec3a3385237e6be6fa9e0c"

SRC_URI[belofilms_GuitarStrums.md5sum] = "bf694c7faa1f5a627e6b713e4005ea75"
SRC_URI[belofilms_GuitarStrums.sha256sum] = "996143d4f2174fd9b1875359b334684a7ba92849775803ca0c01e6c6408ac1e8"

SRC_URI[BJA_Pacific.md5sum] = "cde7a74a06edde3b5f85435c29909891"
SRC_URI[BJA_Pacific.sha256sum] = "a485753a2a60a1ce30e782784c0f26a84bbbee6bdb324b40c04a1f09f3668305"

SRC_URI[Boss_DR-110.md5sum] = "f528892879ee04621055c4a3f12166c1"
SRC_URI[Boss_DR-110.sha256sum] = "5debdfb050f639478725af134d315649f242142f84691ce1409cd9f56f6943be"

SRC_URI[3355606kit.md5sum] = "5dad41a4f0fb5a9fda0af98b9f553060"
SRC_URI[3355606kit.sha256sum] = "96b1d325fd52e97d7b99ca9191cb376e430ecea1f83d12281f314e30f20fa121"

SRC_URI[Classic-626.md5sum] = "86dbdb8d2f9b12690e92211d36c6fe7d"
SRC_URI[Classic-626.sha256sum] = "3e95845d821129b119dea47fd56eadbb17da74b3a95a2154cac31a037b8a6f66"

SRC_URI[Classic-808.md5sum] = "c08d5093fc28a30a7542f0c89493e807"
SRC_URI[Classic-808.sha256sum] = "6be9d2dba736bfcbc85e31ecf744c74b6620143e4fdc198309c4786951077391"

SRC_URI[circAfrique_v4.md5sum] = "e9d8604d2089abc764e54d1f209900b7"
SRC_URI[circAfrique_v4.sha256sum] = "f09ff7e46310409b8ec7f180193cda6bb69e2a67d5e7f78f8c1c1954bb9a3a2c"

SRC_URI[ColomboAcousticDrumkit.md5sum] = "cb11827e185ab5a6906967901495884b"
SRC_URI[ColomboAcousticDrumkit.sha256sum] = "30d30e6c9aeb25597454034cee58495b410a8f95b3d689c9a0c4e2915af7871f"

SRC_URI[YamahaVintageKit.md5sum] = "8f63997dd789179fa009f84cc515fb3e"
SRC_URI[YamahaVintageKit.sha256sum] = "17005f5c79d92af3caef52ea313b1ac5bc49f1eefa4462b22980dec2b031bf27"

SRC_URI[DeathMetal.md5sum] = "0465025dcf6659657b773874d168c27b"
SRC_URI[DeathMetal.sha256sum] = "7ae4f8e7bf52b84637100b6f781e94752ad738626cff912c7704522ea692fbe7"

SRC_URI[Denon-CRB-90.md5sum] = "bcb4424b46938d0a2a5c94cbd4248c1f"
SRC_URI[Denon-CRB-90.sha256sum] = "6a2b743b73a0e3df110bef830ccedec4560964e7f7af7b7810dc9d9b6e66e075"

SRC_URI[Drumkit_excepcional.md5sum] = "49151a17ea5534cd08a9bc58d6972997"
SRC_URI[Drumkit_excepcional.sha256sum] = "634cd9f40a00d8ac6bb1791aadd953fc92536838b206f7f374024bc34b920689"

SRC_URI[EasternHop-1.md5sum] = "8750fcbe186e49a89bc18a9237ee6604"
SRC_URI[EasternHop-1.sha256sum] = "14ed0cd45097471e3f9775958f40441c1c2886d5594e0111e2b0b7e63b5da00f"

SRC_URI[ElectricEmpireKit.md5sum] = "df1bd778148cc25d8f63a8cc7aa91fcb"
SRC_URI[ElectricEmpireKit.sha256sum] = "7229f52268483119c3a8b1e62dc85f801e37b6c34834e8c603d8aaec0445c5f9"

SRC_URI[ErnysPercussion.md5sum] = "0e96f5971d5db887a186d5739c12ab77"
SRC_URI[ErnysPercussion.sha256sum] = "daccb09332bf6aac09b83f9605a084120a9decff1447d02cc68d16b00f101546"

SRC_URI[ForzeeStereo.md5sum] = "c6cd87bf54e0a760c5f4fecbff979100"
SRC_URI[ForzeeStereo.sha256sum] = "37b9f1d6d8fdf2a65aef5fcde5ac305c89983e1e23ce5b8194922640cce9146d"

SRC_URI[Gimme_A_Hand_1_0.md5sum] = "0e381ae9e4e04a5eab1ce5e5dbc3dcd4"
SRC_URI[Gimme_A_Hand_1_0.sha256sum] = "f0cd2e52f0dbc8d6a001f203ee47cd691d8d028d30501ce332a52659aa62a07a"

SRC_URI[Flac_GSCW-1.md5sum] = "529d9be444a6ce0fdfee8738094268a3"
SRC_URI[Flac_GSCW-1.sha256sum] = "710fc835ac4b1bf972205f52e11b533d6b605bc09b834d308a3d2c00fdd9e0b7"

SRC_URI[Flac_GSCW-2.md5sum] = "af973a2929d257da288f7003bd17c327"
SRC_URI[Flac_GSCW-2.sha256sum] = "cb1f1781e35d916b827ae799303b3b49ec0a115147c38ed390cc6b867e402d12"

SRC_URI[HardElectro1.md5sum] = "f953edf3f4227d786df59b544370e379"
SRC_URI[HardElectro1.sha256sum] = "cfde7e4c7a25f0d72d0674b4d849471b9d309e28372709b509e743aad8c30d5c"

SRC_URI[HipHop-1.md5sum] = "7f52d6ac56a31f5b618657d40d4eb86e"
SRC_URI[HipHop-1.sha256sum] = "d194d2d47cd33d09842ecb6db74783aaa89368e69a964868c7fd2feb3e1b7613"

SRC_URI[HipHop-2.md5sum] = "217f38ebf2849b20ff3a5dca1994be08"
SRC_URI[HipHop-2.sha256sum] = "e2c586017bc4952976b8af5447435e7fa5109308861b5f5be3213d86346bd972"

SRC_URI[K-27_Trash_Kit.md5sum] = "f445c60d4625a6bfe6bb9dbac1ac0aa7"
SRC_URI[K-27_Trash_Kit.sha256sum] = "ad88e46d6e07a046cb5443e5bea4cc7645be992fc85e24853372cf5562c5ee24"

SRC_URI[Lightning1024.md5sum] = "8bc8365a17b28ccc41213a0f2f82d869"
SRC_URI[Lightning1024.sha256sum] = "f41377b32b154c809984e11ebaf0b7cfd9bac2ecc26b78c8de7c9bbd243f9310"

SRC_URI[Millo-Drums_v_1.md5sum] = "4c895d59c3bc5f3322d14789de345be2"
SRC_URI[Millo-Drums_v_1.sha256sum] = "c43d5b25938e95bcce4a204892e668b289f419b993e006bdf3f28c9c374b10c9"

SRC_URI[Millo_MultiLayered2.md5sum] = "2da5b8ee87bce3e67464c61ba0b722dd"
SRC_URI[Millo_MultiLayered2.sha256sum] = "c81cebee6a4d0df70fee7456c13bbdfe2c50b39b62888cb03c0768f885eb74dd"

SRC_URI[Millo_MultiLayered3.md5sum] = "79ca7360784ec72959aa07c3c584d76c"
SRC_URI[Millo_MultiLayered3.sha256sum] = "5927572af24f9a2737f94c7c8e816e22d6b28f00e19d575495c1a97351a79096"

SRC_URI[Roland_MC-307_CR78_Cheaps.md5sum] = "76eebc216b1bdf803f431d52f5d9f5df"
SRC_URI[Roland_MC-307_CR78_Cheaps.sha256sum] = "d056d0a0802fd2485f9dd19a459b7dd889760eb30464ce54db0376d63011a675"

SRC_URI[Roland_MC-307_TR-606.md5sum] = "6b5267a2dca66975fab876fed9e90ad2"
SRC_URI[Roland_MC-307_TR-606.sha256sum] = "4a5587dade4855df69e261aad6fc2b3ab8738e1ab7dcfa09c4f6e46187152fc5"

SRC_URI[Roland_MC-307_TR-808.md5sum] = "1a8470f7c02dcf16467d70f91e0e9805"
SRC_URI[Roland_MC-307_TR-808.sha256sum] = "d733cac76ecca2ecbc8f702c9d803583e3c9ef30b8980762f12c00d67a1e8cc9"

SRC_URI[Roland_MC-307_TR-909.md5sum] = "6cdb5e04844a68ea81b0f48b5d1d6c67"
SRC_URI[Roland_MC-307_TR-909.sha256sum] = "6d6bb92c575cb85c32efcac025e3907fbb6667c75c90dc9f98768ba79fd9937d"

SRC_URI[Roland_MC-307_Techno1.md5sum] = "6839431689d416ce10390ab3d3160273"
SRC_URI[Roland_MC-307_Techno1.sha256sum] = "4a99341192ef8774049c10eaf4678358289f3310f4a4b26d7e31f4243cfecf99"

SRC_URI[rumpf_kit_z01_h2.md5sum] = "927094c3712ba0a3724a77e74b2102e9"
SRC_URI[rumpf_kit_z01_h2.sha256sum] = "83f24b15c82d0b34ceaeeb86c5283201b7dd3f5e32b53dfd222d04886bc98740"

SRC_URI[SF3007-2011-Set-03.md5sum] = "f0b243f7bbc0c4c04977b2efa96a07b4"
SRC_URI[SF3007-2011-Set-03.sha256sum] = "cffa12c5a176d9c9532bafacba773c0a0f7e2fe71ea5a14dae402d2de0726ccb"

SRC_URI[Synthie-1.md5sum] = "33f02627ac1489e4ab52c5f078c538b9"
SRC_URI[Synthie-1.sha256sum] = "adcc4a3023708fab46108acfc99dfc04e2b2b62bb21aa87ed8a027ccbb46b576"

SRC_URI[TD-7kit.md5sum] = "635274624e0a739c51b70f72a58cfcec"
SRC_URI[TD-7kit.sha256sum] = "4e9400c2bb7d06f0271bcbf2e052235fe8500095d6e6dfcd8fcb0593571f110b"

SRC_URI[Techno-1.md5sum] = "f91912fc88361dd8954c11f2e602aa25"
SRC_URI[Techno-1.sha256sum] = "83e072ef8e8783d861ce500a8082161392e49853a54335823e1cd7f7874c8504"

SRC_URI[The_Black_Pearl_1_0.md5sum] = "3969810a3a9a8844ccc216802b7288ad"
SRC_URI[The_Black_Pearl_1_0.sha256sum] = "4fb52d1bbdda886db4b742c6de33d7475ef5088076c18533bd705c588f69a87b"

SRC_URI[TR808909.md5sum] = "1db9cce82fbdaebac1ab4608be5853ea"
SRC_URI[TR808909.sha256sum] = "4637f0c39b488074943030d6cb0274f3e35d1da221eb6d078c15ea118f4e496d"

SRC_URI[VariBreaks.md5sum] = "a9c305829cd23c28ffd1647cb5c0bdfd"
SRC_URI[VariBreaks.sha256sum] = "ed7bfa21abc05712ea89860b7e680808d14d567d49377fbc65914a9dd518e14d"

SRC_URI[KawaiXD-5Kit.md5sum] = "ae974ec4550b64654cfb1fe42fe110af"
SRC_URI[KawaiXD-5Kit.sha256sum] = "e3da8b98d8d5804e6ca9c047f2140430f12f8d4ae3db8ec4740f9364467c19ed"

SRC_URI[RolandJD-990Kit.md5sum] = "ef5ecfdea55835789c143c0bc3ac15e9"
SRC_URI[RolandJD-990Kit.sha256sum] = "0ae58586d479ecb0d9b850d832be0483a8aad28eaa7fa46be0d1956d45b0b50c"

SRC_URI[YamahaRX15Kit.md5sum] = "9f143e9f764b1b0341a3e5a528bf3f13"
SRC_URI[YamahaRX15Kit.sha256sum] = "04b7b7d5d56e4b5f6b7daa3579f594df66a5edb776f705413c1d3d2da90e5bd2"

SRC_URI[YamahaTG-55Kit.md5sum] = "cf95db46c05287aaa1a18dff0b0ce335"
SRC_URI[YamahaTG-55Kit.sha256sum] = "8dba9f8fa7027606765b3b9bd3d11470e39919683a8676b1598d96c2f7df1462"


inherit cmake_qt5 manpages

EXTRA_OECMAKE = " \
    -DWANT_DEBUG=OFF \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"

do_install_append() {
    install -d ${D}/${datadir}/${BPN}/data/drumkits
    cp -rf ${WORKDIR}/drumkits/* ${D}/${datadir}/${BPN}/data/drumkits/

    # grant access
    chmod -R 644 ${D}/${datadir}/${BPN}/data/drumkits
    export IFS=$'\n'
    for drumkitdir in `find ${D}/${datadir}/${BPN}/data/drumkits -type d` ; do
        chmod 755 $drumkitdir
    done
}

PACKAGES =+ "${PN}-drumkits"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/appdata \
    ${libdir}/libhydrogen-core* \
"

# only extra drumkits - default kits shipped by sources remain in main package
FILES_${PN}-drumkits = " \
    ${datadir}/${BPN}/data/drumkits/3355606kit \
    ${datadir}/${BPN}/data/drumkits/Audiophob \
    ${datadir}/${BPN}/data/drumkits/belofilms_GuitarStrums \
    ${datadir}/${BPN}/data/drumkits/BJA_Pacific \
    ${datadir}/${BPN}/data/drumkits/Boss_DR-110 \
    ${datadir}/${BPN}/data/drumkits/circAfrique* \
    ${datadir}/${BPN}/data/drumkits/Classic-* \
    ${datadir}/${BPN}/data/drumkits/ColomboAcousticDrumkit \
    ${datadir}/${BPN}/data/drumkits/DeathMetal \
    ${datadir}/${BPN}/data/drumkits/Denon*CRB-90 \
    ${datadir}/${BPN}/data/drumkits/Drumkit*excepcional \
    ${datadir}/${BPN}/data/drumkits/EasternHop-1 \
    ${datadir}/${BPN}/data/drumkits/ElectricEmpireKit \
    ${datadir}/${BPN}/data/drumkits/ErnysPercussion \
    ${datadir}/${BPN}/data/drumkits/Flac_GSCW-* \
    ${datadir}/${BPN}/data/drumkits/ForzeeStereo \
    ${datadir}/${BPN}/data/drumkits/Gimme*A*Hand*1.0 \
    ${datadir}/${BPN}/data/drumkits/HardElectro1 \
    ${datadir}/${BPN}/data/drumkits/HipHop-* \
    ${datadir}/${BPN}/data/drumkits/K-27_Trash_Kit \
    ${datadir}/${BPN}/data/drumkits/Lightning1024 \
    ${datadir}/${BPN}/data/drumkits/Millo* \
    ${datadir}/${BPN}/data/drumkits/Roland* \
    ${datadir}/${BPN}/data/drumkits/rumpf_kit_z01_h2 \
    ${datadir}/${BPN}/data/drumkits/Synthie-1 \
    ${datadir}/${BPN}/data/drumkits/TD-7kit \
    ${datadir}/${BPN}/data/drumkits/Techno-1 \
    ${datadir}/${BPN}/data/drumkits/The*Black*Pearl*1.0 \
    ${datadir}/${BPN}/data/drumkits/TR808909 \
    ${datadir}/${BPN}/data/drumkits/VariBreaks \
    ${datadir}/${BPN}/data/drumkits/YamahaVintageKit \
"
